package nl.hu.iac.service;

import static org.junit.Assert.*;

/**
 * Created by Ulyssesmoore on 26-03-2017.
 */
public class ElektriciteitServiceImplTest {
    private ElektriciteitServiceImpl testImpl = new ElektriciteitServiceImpl();

    @org.junit.Test
    public void createPrijs()
    {
        assertEquals("Eneco",testImpl.getPrijzen().get(0).getCompany());
    }

}