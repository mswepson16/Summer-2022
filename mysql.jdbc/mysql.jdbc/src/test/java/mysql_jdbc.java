import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.sql.*;
public class mysql_jdbc {

	@Test
	public void canSelectCities(){
		//Arrange
		String expectedResult = "'Ziguinchor', 'Zhoushan', 'Zhezqazghan', 'Zeleznogorsk', 'Zaria', 'Zapopan', 'Zaoyang', 'Zanzibar', 'Zalantun','Yuzhou'";
		//Act

		String result = runQuery("SELECT city FROM sakila.city order by city DESC limit 10;","title");

		//Assert
		assertEquals(result,expectedResult,"Expected 10 cities listed in descending order");
	}

	@Test
	public void SelectTitle() {
		//Arrange
		String expectedResult = "'AIRPLANE SIERRA','RAGING AIRPLANE'";

		//Act
		String result = runQuery("SELECT * FROM sakila.film"
				+ "    where title like '%airplane%';","title");

		//Assert
		assertEquals(result,expectedResult,"Expected films with title containing 'airplane'");
	}
	
	@Test
	public void getMaxPayment() {
		//Arrange
		String expectedResult = "11.99";
		//Act
		String result = runQuery("SELECT MAX(amount) FROM sakila.payment;","");
		//Assert
		assertEquals(result,expectedResult,"Expected maximum payment");
	}
	
	@Test
	public void getNumRecords() {
		//Arrange
		int expectedResult = 655;
		//Act
		String result = runQuery("","");
		//Assert
		assertEquals(result,expectedResult,"Expected number of customer records for store 1");
	}

	@Test
	public void getPaymentEmail() {
		//Arrange
		String expectedResult = "303"
				+ "304"
				+ "305"
				+ "306"
				+ "307"
				+ "308"
				+ "309"
				+ "310"
				+ "311"
				+ "312"
				+ "313"
				+ "314"
				+ "315"
				+ "316"
				+ "317"
				+ "318"
				+ "319"
				+ "320"
				+ "321"
				+ "322"
				+ "323"
				+ "324"
				+ "325"
				+ "326"
				+ "327"
				+ "328"
				+ "329"
				+ "330";
		//Act
		String result = runQuery("SELECT payment_id FROM sakila.payment"
				+ "    inner join customer on customer.customer_id = payment.customer_id"
				+ "    where customer.email = 'NANCY.THOMAS@sakilacustomer.org';","payment_id");
		//Assert
		assertEquals(result,expectedResult,"expected payment IDs of specified email");
	}
	
	@Test
	public void getFilmInfo() {
		//Arrange
		String expectedResult = "'19', 'BOB', 'FAWCETT', 'Action: DARN FORRESTER; Animation: DARES PLUTO, LAWLESS VISION, OSCAR GOLD; Children: CIRCUS YOUTH; Classics: DYNAMITE TARZAN; Comedy: CONTROL ANTHEM, HATE HANDICAP, SADDLE ANTITRUST; Documentary: ADAPTATION HOLES, PELICAN COMFORTS; Drama: JACKET FRISCO, SCORPION APOLLO; Family: HOMICIDE PEACH; Games: DAZED PUNK; Horror: ACE GOLDFINGER; Music: PERSONAL LADYBUGS, RUNNER MADIGAN, TAXI KICK; New: CHINATOWN GLADIATOR, JUMANJI BLADE, RUN PACIFIC; Sci-Fi: RAGING AIRPLANE; Travel: LEATHERNECKS DWARFS, SHAWSHANK BUBBLE'\n"
				+ "";
		//Act
		String result = runQuery("SELECT * FROM sakila.actor_info"
				+ "    where first_name = 'BOB' and last_name = 'FAWCETT';","");
		//Assert
		assertEquals(result,expectedResult,"expected film IDs for the specified actor");
	}
	
	@Test
	public void getInvIds() {
		//Arrange
		String expectedResult = "'73','74','75','76'";
		//Act
		String result = runQuery(" select @q_film_id := film_id from film where title = \"ALIEN CENTER\";\n"
				+ " set @p_film_count = 0;\n"
				+ "    call sakila.film_in_stock(@q_film_id, 2, @inventory_id);","");
		//Assert
		assertEquals(result,expectedResult,"excpected inventory ids for specified film");
	} 

	public String runQuery(String sql, String columnLabel) {
		String result = null;
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_database?allowPublicKeyRetrieval=true&useSSL=false","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()) {
				result = rs.getString(columnLabel);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
}
