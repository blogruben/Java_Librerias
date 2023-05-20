package org.ruben.java.junit;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class DirectorioTemporalTests {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
  
    @Test
    public void testUsingTempFolder() throws IOException {
      File createdFolder = folder.newFolder("newfolder");
      File createdFile = folder.newFile("myfilefile.txt");
      System.out.println(createdFolder.getAbsolutePath());
      System.out.println(createdFile.getAbsolutePath());
      assertTrue(createdFile.exists());
    }

}
