package org.crazyit.app.service.impl;

import org.crazyit.app.service.Axe;
import org.crazyit.app.service.Person;
import org.springframework.stereotype.Component;

/**
 * @autohor liuyouyun
 * @date 2019/6/20 - 21:09
 */
@Component("liuyouyun")
public class Chinese implements Person {
    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {

    }
}
