<?php
$xml=simplexml_load_file("q1.xml");
foreach($xml->Book as $b)
{
  echo "bookno=$b->bookno"."<br>";
  echo "booknname=$b->bookname"."<br>";
  echo "authorname=$b->authorname"."<br>";
  echo "price=$b->price"."<br>";
  echo "year=$b->year"."<br>";
}  
?>    
                
