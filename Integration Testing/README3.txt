<!DOCTYPE html>
<html class="no-js" dir="ltr" manifest="/404.appcache">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>WhatsApp Web</title>
<meta name="viewport" content="width=device-width">
<meta name="google" content="notranslate">
<meta name="format-detection" content="telephone=no"/>

<meta name="description" content="Quickly send and receive WhatsApp messages right from your computer.">
<meta name="og:description" content="Quickly send and receive WhatsApp messages right from your computer."/>
<meta name="og:url" content="https://web.whatsapp.com/"/>
<meta name="og:title" content="WhatsApp Web"/>
<meta name="og:image" content="https://www.whatsapp.com/img/whatsapp-promo.png"/>

<link id="favicon" rel="shortcut icon" href="/img/favicon/1x/favicon.png" type="image/png" />
<link rel="apple-touch-icon" sizes="194x194" href="/apple-touch-icon.png" type="image/png" />

<link rel="stylesheet" href="/sprite_aaa6f707db97264a007b75466897c079.css">
<link rel="stylesheet" id="style" href="/style_56c2541f057e23661d28d70ea6ae975a.css">

<style>
html, body, #app {
height: 100%;
width: 100%;
overflow: hidden;
padding: 0;
margin: 0;
}

#app {
position: absolute;
top: 0;
left: 0;
}

#startup, #initial_startup {
width: 100%;
height: 100%;
position: fixed;
background-color: #f2f2f2;

-moz-user-select: none;
-webkit-user-select: none;

display: flex;
align-items: center;
justify-content: center;
display: -webkit-box;
display: -webkit-flex;
-webkit-align-items: center;
-webkit-justify-content: center;
flex-direction: column;
-webkit-flex-direction: column;
}

.spinner-container {
-webkit-animation: rotate 2s linear infinite;
animation: rotate 2s linear infinite;
z-index: 2;
}

.spinner-container .path {
stroke-dasharray: 1,150; 
stroke-dashoffset: 0;
stroke: rgba(27, 154, 89, 0.7);
stroke-linecap: round;
-webkit-animation: dash 1.5s ease-in-out infinite;
animation: dash 1.5s ease-in-out infinite;
}

#startup .spinner-container .path,
#initial_startup .spinner-container .path {
stroke: #acb9bf;
}

@keyframes rotate {
100% { transform: rotate(360deg); }
}
@-webkit-keyframes rotate{
100% { -webkit-transform: rotate(360deg); }
}

@keyframes dash {
0% {
stroke-dasharray: 1,150;  
stroke-dashoffset: 0;
}
50% {
stroke-dasharray: 90,150; 
stroke-dashoffset: -35;   
}
100% {
stroke-dasharray: 90,150; 
stroke-dashoffset: -124;  
}
}
@-webkit-keyframes dash {
0% {
stroke-dasharray: 1,150;  
stroke-dashoffset: 0;
}
50% {
stroke-dasharray: 90,150; 
stroke-dashoffset: -35;   
}
100% {
stroke-dasharray: 90,150; 
stroke-dashoffset: -124;  
}
}

.progress-container {
width: 360px;
position: fixed;
padding-top: 120px;
top: 50%;
left: 50%;
margin-left: -180px;
}

progress {
-webkit-appearance: none;
appearance: none;
width: 100%;
height: 3px;
border: none;
margin: 0;
color: #02d1a4;
background-color: #e0e4e5;
}

progress[value]::-webkit-progress-bar {
background-color: #e0e4e5;
}

progress[value]::-webkit-progress-value {
background-color: #02d1a4;
}

progress[value]::-moz-progress-bar {
background-color: #02d1a4;
}
</style>
</head>
<body>
<div id="app"></div>

<div id="initial_startup">
<svg class="spinner-container" width="50" height="50" viewBox="0 0 44 44">
<circle class="path" cx="22" cy="22" r="20" fill="none" stroke-width="4"></circle>
</svg>
<div class="progress-container">

</div>
</div>

<script src="/progress_7d9c08b7e2d51b148e6c3ead856ca03e.js"></script>


</body>
</html>
