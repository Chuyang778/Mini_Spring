package com.chuyang.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
