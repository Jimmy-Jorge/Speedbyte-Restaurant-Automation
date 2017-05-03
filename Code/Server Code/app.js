var express = require("express");
//var mongoose = require("mongoose";

var bodyparser = require('body-parser');

var crypto = require('crypto');

var app = express();
app.use(bodyparser.json());
//var port = 8080;
var i = 0;

var chef = {
	username:'chef@mail.com',
	password:'test_pass',
	keys:{}
};

var customer = {
	username:'tim@mail.com',
	password:'test_pass',
	keys:{}
};

var manager = {
	username:'manager@mail.com',
	password:'test_pass',
	keys:{}
};

var waiter = {
	username:'waiter@mail.com',
	password:'test_pass',
	keys:{}
};

var busboy = {
	username:'busboy@mail.com',
	password:'test_pass',
	keys:{}
};


app.post("/", function(req, res){
	
	console.log('federer');
    res.status(200).send('Federer is the best');
		
});

app.post('/login', function(req,res) {
   var data = req.body;
	console.log(data);
   if (!data.hasOwnProperty('username')) {
      res.status(400).send('You need a username.');
   }
   else if (!data.hasOwnProperty('password')) {
      res.status(400).send('You need a password.');
   }
   else if (chef.username != data.username && customer.username != data.username && manager.username != data.username && waiter.username != data.username && busboy.username != data.username) {
      res.status(401).send('This username is not registered.');
   }
   else if (chef.username != data.username && customer.username != data.username && manager.username != data.username && waiter.username != data.username && busboy.username != data.username) {
      res.status(401).send('This password is incorrect.');
   }
   else {
      crypto.randomBytes(16, function(err, buffer) {
         if (err) {
            res.status(404).send('Could not generate secure key.');
         } else {
            res.status(200).send(buffer.toString('hex'));
            if(chef.username == data.username){
            	chef.keys[buffer.toString('hex')] = true;
            }else{
            	customer.keys[buffer.toString('hex')] = true;
            }
            
         }
      });
   }
   
   
   
});


app.listen(3000, function() {
    console.log('Listening to port:  ' + 3000);
});
