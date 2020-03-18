const express = require('express');
const mongoose = require('mongoose');

// Import Users
require('./models/Users');
const Users = mongoose.model('users');

const app = express();

// Força o uso do JSON
app.use(express.json());

// Conexão com MONGODB
mongoose.connect('', {
  useNewUrlParser: true,
  useUnifiedTopology: true
}).then(() => {
  console.log("Connecting Success!!")
}).catch((error) => {
  console.log("Error Connection!!" + error)
});

// Rotas
// Listar Usuários
app.get("/user", (req, res) => {
  // res.send('Hello word')
  Users.find({}).then((users) => {
    return res.json(users);
  }).catch((err) => {
    return res.status(400).json({
      error: true,
      message: "Error: Nenhum usuário eoncontrado"
    })
  });
});

// Visualizar usuários por id
app.get("/user/:id", (req, res) => {
  Users.findOne({
    _id: req.params.id
  }).then((user) => {
    return res.json(user);
  }).catch((err) => {
    return res.status(400).json({
      error: true,
      message: "Error: Nenhum susuário encontrado!"
    });
  });
});

// Cadastrar Usuarios
app.post("/cadastrar", (req, res) => {
  // let user = req.body;
  Users.create(req.body, (err) => {
    if (err) return res.status(400).json({
      error: true,
      message: "Error: Usuário não cadastrado!"
    })
    return res.json({
      error: false,
      message: "Show: Usuário cadastrado com sucesso!"
    });
  });
});

// Atualizar
app.put("/user/:id", (req, res) => {
  Users.updateOne({
    _id: req.params.id
  },
    req.body, (err) => {
      if (err) return res.status(400).json({
        error: true,
        message: "Error: Erro ao atualizar usuário!"
      });
      return res.json({
        error: false,
        message: "Show: Usuário atualizado com sucesso!"
      });
    });
});

// Deletar Usuário
app.delete("/user/:id", (req, res) => {
  Users.deleteOne({ _id: req.params.id }, (err) => {
    if (err) return res.status(400).json({
      error: true,
      message: "Error: Erro ao deletar usuário!"
    });
    return res.json({
      error: false,
      message: "Show: Usuário deletado com sucesso!!!"
    });
  });
});


app.listen(8080, () => {
  console.log("Servidor Runing Port 80 manolo")
});