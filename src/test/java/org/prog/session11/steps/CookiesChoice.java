package org.prog.session11.steps;

import lombok.Getter;
import org.openqa.selenium.By;

public enum CookiesChoice {
    ACCEPT(By.id("accept")),
    REJECT(By.id("reject"));

    @Getter
    private By selector;

    CookiesChoice(By selector) {
        this.selector = selector;
    }
}
