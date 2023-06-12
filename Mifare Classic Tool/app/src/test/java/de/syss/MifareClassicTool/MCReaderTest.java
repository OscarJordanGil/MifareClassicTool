package de.syss.MifareClassicTool;
import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MCReaderTest {

    @Mock
    private Tag mockTag;

    @Mock
    private MifareClassic mockMFC;

    private MCReader mcReader;

    @Before
    public void setup() {
        mockTag = mock(Tag.class);
        mockMFC = mock(MifareClassic.class);
        mcReader = new MCReader(mockTag);
    }

    @Test
    public void testBlockToSector() {
        int blockIndex = 10;
        int expectedSector = 2;
        int actualSector = MCReader.blockToSector(blockIndex);
        assertEquals(expectedSector, actualSector);
    }
}
