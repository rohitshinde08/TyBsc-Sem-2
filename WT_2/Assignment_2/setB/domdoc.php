<?php
$xml = new DOMDocument;
$xml->load('movie.xml');
$movies = $xml->getElementsByTagName('movie');
foreach ($movies as $movie) 
{
    echo "$movie->textContent";
    $movieTitle = $movie->getElementsByTagName('movieTitle')->item(0)->nodeValue;
    $actorName = $movie->getElementsByTagName('actorName')->item(0)->nodeValue;
    echo "MovieName: $movieTitle, ActorName: $actorName<br>";
}
?>
