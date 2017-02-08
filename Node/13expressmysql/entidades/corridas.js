var mysql = require('mysql');
var conexion = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "admin",
    database: "corridas",
    port: 3306
});

var corridasModel = {};


corridasModel.getCorridas = function(callback) {
    if (conexion) {
        conexion.query(`SELECT*FROM corrida`, (err, rows) => {
            if (err) {
                throw err
            } else {
                callback(err, rows);
            }
        });
    }
};

corridasModel.insertar = function(corrida, callback) {
    if (conexion) {
        conexion.query(`INSERT INTO corrida SET ?`, corrida, (err, res) => {
            if (err) {
                throw err
            } else {
                callback(err, res);
            }
        })
    }
}

corridasModel.getCorrida = function(id, callback) {
    if (conexion) {
        conexion.query(`SELECT * FROM corrida WHERE idCorrida=${id}`, (err, row) => {
            if (err) {
                throw err
            } else {
                callback(err, row[0]);
            }
        });
    }
}

module.exports = corridasModel;