package ut.com.github.signed.jira;

import org.junit.Test;
import com.github.signed.jira.api.MyPluginComponent;
import com.github.signed.jira.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}