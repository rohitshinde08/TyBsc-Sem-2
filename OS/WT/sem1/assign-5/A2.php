<?php
	$et=$_GET['t1'];
	$con=pg_connect("host=192.168.1.254 dbname=ty73 user=ty73 password=ty73");
	if ($con)
		echo "DataBase Connected <br>";
	else
		echo "DB not Connected";
	$sql = <<<EOF
		CREATE TABLE EVENT(eno int primary key,title text,date varchar(20));
		CREATE TABLE COMMITTEE(cno int primary key,name text,head text,from_time text,status text,to_time text);
		CREATE TABLE EC(eno int references EVENT(eno),cno int references COMMITTEE(cno));
		
		INSERT INTO EVENT VALUES(1,'Genesis','2/12/23');
		INSERT INTO EVENT VALUES(2,'Annual Day','4/12/23');
		INSERT INTO EVENT VALUES(3,'Sports Day','12/12/23');
		
		insert into COMMITTEE values(11,'TCS','SHUKLA',5,'WORKING',8);
		insert into COMMITTEE values(22,'INFOSYS','Mehta',4,'WORKING',7);
		insert into COMMITTEE values(33,'INFOSYS','Omkar',6,'NON-WORKING',8);
		
		
		insert into EC values(1,11);
		insert into EC values(2,22);
		insert into EC values(3,33);
		
		
		
	EOF;
	$ret=pg_query($con,$sql);
	if (!$ret)
		echo pg_last_error($con);
	else
		echo "Records Created Successfully!<br>";
	$q1="update COMMITTEE c set status='WORKING' where cno=(select c.cno from EC,event e, committee c where e.eno=EC.eno and c.cno=EC.cno and e.title='Sports Day');";
	$updateSql=pg_query($q1);
	echo "Status updated SUccessfully";
	pg_close($con);
?>
