<html>
<head>
<script language="javascript">
var req=false;
if(window.XMLHttpRequest)
{
req=new XMLHttpRequest();
 }
else  if(window.ActiveXObject)
{
req=new ActiveXObject("Microsoft.XMLHttp");
}
function fetchdata(datasource,divID)
{
if(req)
  {
req.open("GET",datasource);
req.onreadystatechange=function()
                {
if(req.readyState==4 &&req.status==200)
                    {
document.getElementById(divID).innerHTML=req.responseText;
                    }
               }
req.send(null);
      }
  }
</script>
</head>
<body>
<form>
<input type=button value="Fetch Message" onClick="fetchdata('myfile.txt','myDiv')">
</form>
<div id="myDiv">data will be here</div>
</body>
</html>
