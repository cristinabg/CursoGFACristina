var arreglos = [1, 7, 4, 43, 2, 9, 10, 5, 33, 73];
var par = [];
var impar = [];

//Desglozar en 2 arreglos, pares e impares.

arreglos.forEach(function(element) {
    var valor = element % 2;
    if (valor == 0) {
        par.push(element);
    } else {
        impar.push(element);
    }
}, this);
console.log("------Original------");
console.log(arreglos);
console.log("------Pares------");
console.log(par);
console.log("------Impares------");
console.log(impar);