package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.BlockGridPage;

public class BlockGridPageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(BlockGridPage.class);
		tester.assertRenderedPage(BlockGridPage.class);
	}

}
