import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import io.swagger.service.PaymentServiceImpl;
@RunWith(SpringRunner.class)
public class PaymentApiTest {
	
	
	
	@Test
	public void cancelPaymentApi() throws Exception {
		assertEquals("CANCELLED", new PaymentServiceImpl().cancelPayment());
	}
	@Test
	public void commitPaymentApi() throws Exception {
		assertEquals("SUCCESS", new PaymentServiceImpl().savePayment());
	}
	@Test
	public void getPaymentStatusApi() throws Exception {
		assertEquals("PENDING", new PaymentServiceImpl().getPaymentStatus());
	}
	@Test
	public void updatePaymentStatusApi() throws Exception {
		assertEquals("UPDATED SUCCESSFULLY", new PaymentServiceImpl().updatePayment());
	}

}
