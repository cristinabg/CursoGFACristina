var soap = require('soap');
var xml2js = require('xml2js');

//var url = "http://www.webservicex.net/globalweather.asmx?wsdl";
var url = "http://localhost:8086/05EstadosMexico/estados?wsdl";
var parse = xml2js.parseString;

/*soap.createClient(url, (err1, cliente) => {
    cliente.GetCitiesByCountry({ CountryName: 'Mexico' }, (err2, response) => {
        //console.log(response.GetCitiesByCountryResult);
        parse(response.GetCitiesByCountryResult, (err3, result) => {
            console.log(result.NewDataSet.Table);
        });
    });
});*/

var options = {
    ignoredNamespaces: {
        namespaces: ['ws'],
        override: true
    }
}
soap.createClient(url, options, (err1, cliente) => {
    cliente.getEstados((err2, response) => {
        console.log(response);

        response.nombreEstado.forEach((e) => {
            console.log(e.nombre + "|" + e.capital);
        });
    });
});