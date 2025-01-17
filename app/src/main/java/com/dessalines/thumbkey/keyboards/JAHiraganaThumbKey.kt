@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_JA_HIRAGANA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ま", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("み"),
                    left = KeyC("む"),
                    top = KeyC("め"),
                    right = KeyC("も"),
                ),
                KeyItemC(
                    center = KeyC("は", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ひ"),
                    left = KeyC("ふ"),
                    top = KeyC("へ"),
                    right = KeyC("ほ"),
                ),
                KeyItemC(
                    center = KeyC("さ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("し"),
                    left = KeyC("す"),
                    top = KeyC("せ"),
                    right = KeyC("そ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("や", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ゆ"),
                    right = KeyC("よ"),
                ),
                KeyItemC(
                    center = KeyC("な", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("に"),
                    left = KeyC("ぬ"),
                    top = KeyC("ね"),
                    right = KeyC("の"),
                ),
                KeyItemC(
                    center = KeyC("か", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("き"),
                    left = KeyC("く"),
                    top = KeyC("け"),
                    right = KeyC("こ"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ら", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("り"),
                    left = KeyC("る"),
                    top = KeyC("れ"),
                    right = KeyC("ろ"),
                ),
                KeyItemC(
                    center = KeyC("た", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ち"),
                    left = KeyC("つ"),
                    top = KeyC("て"),
                    right = KeyC("と"),
                ),
                KeyItemC(
                    center = KeyC("あ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("い"),
                    left = KeyC("う"),
                    top = KeyC("え"),
                    right = KeyC("お"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("わ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ゐ"),
                    left = KeyC("ん"),
                    top = KeyC("ゑ"),
                    right = KeyC("を"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("゛"),
                            action = ComposeLastKey("゛"),
                            size = LARGE,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("。"),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("？"),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    right = KeyC("、"),
                ),
                KeyItemC(
                    center = KeyC(" "),
                    backgroundColor = SURFACE_VARIANT,
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_HIRAGANA_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("「", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("【"),
                    left = KeyC("〔"),
                    top = KeyC("〖"),
                    right = KeyC("『"),
                ),
                KeyItemC(
                    center = KeyC("・", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("※"),
                ),
                KeyItemC(
                    center = KeyC("」", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("】"),
                    left = KeyC("』"),
                    top = KeyC("〗"),
                    right = KeyC("〕"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("（", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("！", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("）", size = LARGE),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ゟ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("？", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ゝ", size = LARGE),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ー", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("〜"),
                    top = KeyC("…"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("あ"),
                            action = ToggleShiftMode(false),
                            size = LARGE,
                            color = MUTED,
                        ),
                ),
                KeyItemC(
                    center = KeyC(" "),
                    backgroundColor = SURFACE_VARIANT,
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_JA_HIRAGANA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "japanese hiragana thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_JA_HIRAGANA_THUMBKEY_MAIN,
                shifted = KB_JA_HIRAGANA_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
