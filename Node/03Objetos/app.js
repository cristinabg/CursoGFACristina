var boletos = [{
        folio: 4,
        destino: 'GTO',
        preci: 62
    },
    {
        folio: 5,
        destino: 'CELAYA',
        preci: 69
    },
    {
        folio: 6,
        destino: 'SILAO',
        preci: 29
    },
    {
        folio: 7,
        destino: 'GDL',
        preci: 12
    }
]

//Ordenar los boletos en el mismo arreglo por precio


console.log(boletos);
boletos.sort(function(a, b) {
    return b.preci - a.preci;
})
console.log("----Ordenado----");
console.log(boletos);