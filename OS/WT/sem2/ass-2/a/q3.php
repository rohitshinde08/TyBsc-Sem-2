<?php
$bno_1=$_GET['bno1'];
$bname_1=$_GET['bname1'];
$aname_1=$_GET['aname1'];
$price_1=$_GET['price1'];
$year_1=$_GET['year1'];

$bno_2=$_GET['bno2'];
$bname_2=$_GET['bname2'];
$aname_2=$_GET['aname2'];
$price_2=$_GET['price2'];
$year_2=$_GET['year2'];

$abc=simplexml_load_file("q3.xml");
$xml="<?xml version='1.0' encoding="UTF-8"?>";
$xml="<?xml-stylesheet type="text/css" href="q3.css"?>";
$xml=$xml."<BookInfo>";
$xml=$xml."<book>";
$xml=$xml."<bookno>";
$xml=$xml."$bno_1";
$xml=$xml."</bookno>";
$xml=$xml."<bookname>";
$xml=$xml."$bname_1";
$xml=$xml."</bookname>";
$xml=$xml."<authorname>";
$xml=$xml."$aname_1";
$xml=$xml."</authorname>";
$xml=$xml."<price>";
$xml=$xml."$price_1";
$xml=$xml."</price>";
$xml=$xml."<year>";
$xml=$xml."$year_1";
$xml=$xml."</year>";
$xml=$xml."</book>";
$xml=$xml."</BookInfo>";

$xml=$xml."<BookInfo>";
$xml=$xml."<book>";
$xml=$xml."<bookno>";
$xml=$xml."$bno_2";
$xml=$xml."</bookno>";
$xml=$xml."<bookname>";
$xml=$xml."$bname_2";
$xml=$xml."</bookname>";
$xml=$xml."<authorname>";
$xml=$xml."$aname_2";
$xml=$xml."</authorname>";
$xml=$xml."<price>";
$xml=$xml."$price_2";
$xml=$xml."</price>;
$xml=$xml."<year>";
$xml=$xml."$year_2";
$xml=$xml."</year>";
$xml=$xml."</book>";
$xml=$xml."</BookInfo>";

if($fp=fopen("q3.xml","w+"))
{
   if($wt=fwrite($fp,$xml))
   {
      header("location:q3.xml");
   }
   else
      echo "file not create";
}
else
  echo "file not open";
?>        
         
