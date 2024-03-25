<?php 
$xml= new DOMDocument;
$xml->load('movie.xml');
$movies=$xml->getElementsByTagname('movie');
foreach($movies as $movie)
{
   echo "$movie->textContent";
   $movieTitle=$movie->getElementsByTagName('movieTitle')->item(0)->nodeValue;
   $actorname=$movie->getElementsByTagName('actorname')->item(0)->nodeValue;
   echo"MovieName: $movieTitle, ActorName: $actorname<br>";
}
?>   
