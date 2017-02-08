var express = require('express');
var router = express.Router();
var corridasModel = require("../entidades/corridas");

router.get("/", function(req, res) {
    corridasModel.getCorridas((err, rows) => {
        if (req.accepts("html")) {
            res.render("corridas", { corridas: rows });
        } else {
            res.json(200, rows);
        }
    })
});

router.post("/insertar", (req, res) => {
    var corrida = {};
    corrida.origen = req.body.origen;
    corrida.destino = req.body.destino;
    corrida.fechaSalida = req.body.fechaSalida;
    corrida.fechaLlegada = req.body.fechaLlegada;
    corrida.horaSalida = req.body.horaSalida;
    corrida.horaLlegada = req.body.horaLlegada;
    corrida.escalas = req.body.escalas;

    corridasModel.insertar(corrida, (err, response) => {
        if (response && response.insertId) {
            res.json(200, { "success": true });
        } else {
            res.json(200, { "success": false });
        }
    });
});
router.get("/:id", function(req, res) {
    corridasModel.getCorrida(req.params.id, (err, row) => {
        if (row) {
            if (req.accepts("html")) {
                res.render("corrida", { corrida: row });
            } else {
                res.json(200, row);
            }
        } else {
            var err = new Error('Not Found');
            err.status = 404;
            res.render('error', { error: err });
        }
    })
});
module.exports = router;