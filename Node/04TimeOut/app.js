setTimeout(() => {
    console.log("Hola");
}, 1000);
setTimeout(() => {
    console.log("Hola 2000 milisegundos");
}, 2000);
var saludo = function() {
    console.log("Hola soy un intervalo");
}
saludo();
setInterval(saludo, 1000);

console.log("Hola sin TimeOut");