# JdbcCRUD
Jdbc Crud in Netbeans java Swing Framework based.

<h1>Requirements and Tips: </h1>
<h3>'Java SE8 and MySql'</h3>
<h3>If you want practice the MVC pattern, this is good oppurtunity for practicsin the MVC Pattern because you will learn how to do a clean code etc.</h3>






<h1>Installation: </h1>
<h2>1st: </h2>
<h4>Download the SimpleCRUD open project/import in netbeans</h4>
<h2>2nd: </h2>
<h4>If there's a error right click the project and resolve the problems you can find the following jar in folder of "libraries" install the following jar.</h4>
<h2>3rd: </h2>
<h4>Now install your sql open your xampp import the sql which you can find in libraries/informatics.sql</h4>
<h2>Run your project: </h2>

![simplecrud](/images/1.png)

<h1> Add this "If you planning to use the query in a large project" </h1>

<h3>I did'nt put the preparedStatement, Resultset, Connection close but if you work for a large project you need to close the query everytime you use the example of closing is</h3>

 PreparedStatement ps;

try{

//Your example query

}catch (SQLException e){

//Your stack trace

}

finally {

if (ps !=null)
{

    ps.close();
    
    }
}

PS:

If you have a PreparedStatement, ResultSet and Connection always disclose that.

<h2>Metro UI Themes</h2>

<h4>I use different libraries and big credits to Rojeru-San for the Metro UI libraries.</h4>
