const express = require("express");

const app = express();

const port = 3080;
let animals = [
  { id: 1, name: "perro" },
  { id: 2, name: "cat" },
  { id: 3, name: "loro" },
];
// Middleware para analizar el cuerpo de la solicitud en formato JSON
app.use(express.json());

app.listen(port, () => {
  console.log(`server is connected port ${port}`);
});
//metodo get
app.get("/", (req, res) => {
  res.send("Bienvenido a mi servidor");
});
app.get("/animals", (req, res) => {
  res.send(animals);
});
//metodo post
app.post("/animals", (req, res) => {
  animals.push({ id: 4, name: "caballo" });
  res.send("animal agregado");
});
//metodo patch
app.patch("/animals/:id", (req, res) => {
  const { body } = req;
  const { name } = body;
  const { id } = req.params;
  let animal = animals.find((animal) => animal.id === id);
  if (animal) {
    animal.name = name;
    res.send({ message: "animal eliminado" });
  } else {
    res.status(404).send("animal no encontrado");
  }
});

app.delete("/animals/:id", (req, res) => {
  const { id } = req.params;
  animals = animals.filter((animal) => animal.id != id);
  res.send("animal eliminado");
});
