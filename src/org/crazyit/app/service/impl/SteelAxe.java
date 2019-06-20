package org.crazyit.app.service.impl;

import org.crazyit.app.service.Axe;
import org.springframework.stereotype.Component;

/**
 * @autohor liuyouyun
 * @date 2019/6/20 - 21:11
 */
@Component
public class SteelAxe implements Axe {
    @Override
    public String chop() {
        return "钢斧砍柴真快";
    }
}
