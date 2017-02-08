var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.get('/', (req, res) => {
    res.sendfile(__dirname + "/index.html");
});
io.on('connection', (socket) => {
    socket.on('Mensaje Chat', (mensaje) => {
        console.log(mensaje);
        io.emit('Mensaje Chat', mensaje);
    });
});

http.listen(3000, () => {
    console.log("El servidor esta corriendo en el puerto 3000")
});