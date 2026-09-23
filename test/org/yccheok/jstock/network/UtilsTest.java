/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2015 Yan Cheng Cheok <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.network;

import junit.framework.TestCase;

/**
 * Unit test for network Utils.
 */
public class UtilsTest extends TestCase {
    
    public UtilsTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetJStockStaticServer() {
        System.out.println("getJStockStaticServer");
        String server = Utils.getJStockStaticServer();
        assertNotNull(server);
        assertTrue(server.startsWith("http://"));
    }

    public void testGetURL() {
        System.out.println("getURL");
        String url = Utils.getURL(Utils.Type.CHAT_SERVER_TXT);
        assertNotNull(url);
        assertTrue(url.contains("chat_server.txt"));
    }
}
