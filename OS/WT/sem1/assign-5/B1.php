<html>
<head>
    <title>PHP TABLE</title>
</head>
<body>
 	<table border="1">
 	<h1>Table Item</h1>
        <tr>
            <th>Item Code</th>
            <th>Item Name</th>
            <th>Unit Sold</th>
            <th>Rate</th>
            <th>Total</th>
        </tr>
        <?php
             $lines=file("item.dat");
      	     $totalBill=0;
             foreach($lines as $line) 
             {
                $itemDetails=explode(",", $line);
            	$iCode=trim($itemDetails[0]);
            	$iname=trim($itemDetails[1]);
            	$usold=trim($itemDetails[2]);
            	$rate=trim($itemDetails[3]); 
                
                $total=$usold*$rate;

	        echo "<tr>";
	        echo "<td>$iCode</td>";
                echo "<td>$iname</td>";
                echo "<td>$usold</td>";
                echo "<td>$rate</td>";
                echo "<td>$total</td>";
                echo "</tr>";

                $totalBill += $total;
        }
        ?>

        <tr>
            <td colspan="4">Total Bill</td>
            <td><?php echo $totalBill; ?></td>
        </tr>
    </table>
    
</body>
</html>
