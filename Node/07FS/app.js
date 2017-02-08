var fs = require('fs');
var contenido;

fs.readFile('./archivo.txt', function(err, data) {
    contenido = data.toString();
    console.log(contenido);
    // escribir();
}).then(function(response) {
    fs.writeFile('./nuevo.txt', contenido, err => {
        console.log("Guardado!");
    });
}, function(error) {
    console.log("error");
});


console.log("---------------------------------------");
console.log("De forma asincrona, esta variable estaría nulla porque aún no esta obteniendo el contenido del redfile " + contenido);
console.log("---------------------------------------");

var escribir = function() {
    fs.writeFile('./nuevo.txt', contenido, err => {
        console.log("Guardado!");
    });
}