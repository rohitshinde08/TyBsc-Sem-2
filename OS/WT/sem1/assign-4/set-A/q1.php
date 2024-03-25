<html>
  <head>
    <title> array </title>
      <style>
        #decoration{
                    position:relative;
                    height:75;
                    top:10px;
                    left:20px;
                    background-color:lightblue;
       }
     </style>
  </head>
 
    <div id="decoration">
    <?php
    $a=array(80,75,76,84,89,67,86,92,81,56,77,95,73,68,95,83,88,62,90,73,83,94,79,71,70,83,69,94,99,81);
    $c=count($a);
    $sum=array_sum($a);
    $avg=$sum/$c;
    echo"average temperature :$avg & deg:F";
    asort($a);
    $low=array_slice($a,0,5);
    $high=array_slice($a,-5,5);
    echo"<br> 5 lowest temperaature :<br>";
    foreach($low as $value)
    {
      echo "$value &deg;F<br>";
    }
    echo"<br> 5 hightest temperaature :<br>";
    foreach($high as $value)
    {
      echo "$value &deg;F<br>";
    }
?>
</div>
</html>    
                            
