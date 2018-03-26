package net.mybrainlab.camp.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SimpleTemplateEnginTest {

    private SimpleTemplateEngin ste = new SimpleTemplateEngin();

    @Test
    public void loadTemplate() {
        try {
            ste.loadTemplate("templates/mailauth.txt");
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void add() {
    }

    @Test
    public void buildTemplate() {
    }
}