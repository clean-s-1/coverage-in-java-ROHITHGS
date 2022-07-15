package TypewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TypewiseAlertTest 
{
    @Test
    public void infersBreachToolow()
    {
      assertTrue(TypewriteAlert.inferBreach(12, 20, 30) ==
        BreachTypes.TOO_LOW);
    }

    @Test
    public void infersBreachTooHigh()
    {
        assertTrue(TypewriteAlert.inferBreach(35, 20, 30) ==
                BreachTypes.TOO_HIGH);
    }

    @Test
    public void infersBreachNormal()
    {
        assertTrue(TypewriteAlert.inferBreach(25, 20, 30) ==
                BreachTypes.NORMAL);
    }

    @Test
    public void checkAlert_controller_Passive_cooling() {
        assertTrue(TypewriteAlert.checkAndAlert(AlertTargets.TO_CONTROLLER,CoolingTypes.PASSIVE_COOLING,29));
    }

    @Test
    public void checkAlert_controller_Med_cooling() {
        assertTrue(TypewriteAlert.checkAndAlert(AlertTargets.TO_CONTROLLER,CoolingTypes.MED_ACTIVE_COOLING,33));
    }
    @Test
    public void checkAlert_controller_High_ACIVE_COOLING() {
        assertTrue(TypewriteAlert.checkAndAlert(AlertTargets.TO_CONTROLLER,CoolingTypes.HI_ACTIVE_COOLING,46));
    }
    @Test
    public void checkAlert_mail_Passive_cooling() {
        assertTrue(TypewriteAlert.checkAndAlert(AlertTargets.TO_MAIL,CoolingTypes.PASSIVE_COOLING,29));
    }

    @Test
    public void checkAlert_mail_active_cooling() {
        assertTrue(TypewriteAlert.checkAndAlert(AlertTargets.TO_MAIL,CoolingTypes.HI_ACTIVE_COOLING,47));
    }
    @Test
    public void checkAlert_mail_mid_active_cooling() {
        assertTrue(TypewriteAlert.checkAndAlert(AlertTargets.TO_MAIL,CoolingTypes.MED_ACTIVE_COOLING,35));
    }


}
