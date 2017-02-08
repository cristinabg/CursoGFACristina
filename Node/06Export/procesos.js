//utilizar librerias de module
var exports = module.exports = {};
exports.boletos = [];



exports.insertar = (boleto) => {
    var repetido = false;
    exports.boletos.forEach(function(element) {
        if (boleto.folio == element.folio) {
            repetido = true;
            return;
        }
    }, this);
    if (!repetido) {
        exports.boletos.push(boleto);
    }
}

exports.eliminar = (folio) => {
    exports.boletos.forEach(function(element) {
        if (folio == element.folio) {
            exports.boletos.splice(exports.boletos.indexOf(element), 1);
        }
    }, this);
}

exports.imprimir = () => {
    console.log(exports.boletos);
}