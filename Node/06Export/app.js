var boletos = require('./procesos.js');

var b1 = {
    folio: 3929,
    origen: "GTO",
    destino: "GDL",
    costo: 9382
};
var b2 = {
    folio: 3129,
    origen: "GTO",
    destino: "CLY",
    costo: 382
};
var b3 = {
    folio: 3729,
    origen: "GTO",
    destino: "ON",
    costo: 382
};

boletos.insertar(b1);
boletos.insertar(b2);
boletos.insertar(b3);

boletos.imprimir();