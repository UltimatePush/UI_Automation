package org.utils.setup;

public enum Setup {
    @ConfigKey("app.url")
    URL,
    @ConfigKey("app.browser")
    BROWSER;

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
