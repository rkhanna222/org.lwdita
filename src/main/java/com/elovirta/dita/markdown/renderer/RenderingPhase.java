package com.elovirta.dita.markdown.renderer;

@Deprecated
public enum RenderingPhase {
    HEAD_TOP,
    HEAD,
    HEAD_CSS,
    HEAD_SCRIPTS,
    HEAD_BOTTOM,

    BODY_TOP,
    BODY,
    BODY_BOTTOM,
    BODY_LOAD_SCRIPTS,
    BODY_SCRIPTS
}
