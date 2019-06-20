package org.crazyit.app.service.impl;

import org.crazyit.app.service.Axe;
import org.springframework.stereotype.Component;

/**
 * @autohor liuyouyun
 * @date 2019/6/20 - 21:17
 */
@Component("sssssssssss")
public class StoneAxe implements Axe {
    @Override
    public String chop() {
        return "石斧砍柴好慢";
    }
}
