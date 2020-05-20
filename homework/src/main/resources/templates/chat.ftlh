<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Чат</title>
    <style>
        html {
            background-color: dodgerblue;
        }
        .div1{
            position: absolute;
            width: 100%;
        }
        #message{
            height: 30px;
            width: 80%;
        }
    </style>

    <link rel="stylesheet" href="https://cdn.shoelace.style/1.0.0-beta.25/shoelace.css">
</head>
<body onload="connect()">
<h1>Сообщения</h1>
<div class="div1">
    <input type="textarea" name="message" id="message" placeholder="Сообщение">
    <button onclick="sendMessage($('#message').val(), '${user.name}')">Отправить</button>

    <ul id="messagesList">

    </ul>
</div>
<script
        src="https://code.jquery.com/jquery-3.4.1.js"
        integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
        crossorigin="anonymous"></script>
<script>
    var webSocket;
    function connect() {
        webSocket = new WebSocket('ws://localhost:8080/chat');

        document.cookie = 'X-Authorization=' + '123456' + ';path=/';

        webSocket.onmessage = function receiveMessage(response) {
            var data = response['data'];
            var json = JSON.parse(data);
            $('#messagesList').first().after("<li>" + json['from'] + ' ' + json['text'] + "</li>")
        }
    }

    function sendMessage(text, pageId) {
        var message = {
            "text": text,
            "from": pageId
        };

        webSocket.send(JSON.stringify(message));
    }
</script>
</body>
</html>
