package org.arquillian.example;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.inject.Inject;

@RunWith(Arquillian.class)
public class GreeterTest {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClasses(Greeter.class, PhraseBuilder.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    Greeter greeter;

    @Test
    public void should_create_greeting() {
        Assert.assertEquals("Hello, Earthling!",
                greeter.createGreeting("Earthling"));
        greeter.greet(System.out, "Earthling");
    }

    @Test
    public void should_create_greeting2() {
        Assert.assertEquals("Hello, World!",
                greeter.createGreeting("World"));
        greeter.greet(System.out, "World");
    }
<<<<<<< HEAD
    
    @Test
    public void should_create_greeting_fail() {
        Assert.assertEquals("Hello, World!",
                greeter.createGreeting("to all"));
=======

    @Test
    public void should_create_greeting_fail() {
        Assert.assertEquals("Hello, World!",
                greeter.createGreeting("World"));
>>>>>>> 0b9c0f1c20346e48e977754fc2c17d9da0560f61
        greeter.greet(System.out, "to all");
    }
}