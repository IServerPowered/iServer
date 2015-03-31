package com.iserver;

import java.util.ArrayList;

public enum ChatColor {

	BLACK('0', 0), DARK_BLUE('1', 1), DARK_GREEN('2', 2), DARK_AQUA('3', 3), DARK_RED(
			'4', 4), DARK_PURPLE('5', 5), GOLD('6', 6), GRAY('7', 7), DARK_GRAY(
			'8', 8), BLUE('9', 9), GREEN('a', 10), AQUA('b', 11), RED('c', 12), LIGHT_PURPLE(
			'd', 13), YELLOW('e', 14), WHITE('f', 15), MAGIC('k', 16, true), BOLD(
			'l', 17, true), STRIKETHROUGH('m', 18, true), UNDERLINE('n', 19,
			true), ITALIC('o', 20, true), RESET('r', 21);

	private char color = 'f';

	private boolean format = false;

	private int colorID;

	private static final ArrayList<ChatColor> authorizedColors = new ArrayList<ChatColor>();

	private ChatColor(char color, int id) {
		this(color, id, false);
	}

	private ChatColor(char color, int id, boolean bool) {
		this.color = color;
		this.colorID = id;
		this.format = bool;
	}

	public char getColor() {
		return color;
	}

	public boolean isFormat() {
		return format;
	}

	public int getColorID() {
		return colorID;
	}

	static {

		for (ChatColor color : ChatColor.values()) {
			if (authorizedColors.contains(color)) {
				break;
			}

			else

			{
				continue;
			}
		}

		authorizedColors.add(BLUE);
		authorizedColors.add(DARK_BLUE);
		authorizedColors.add(DARK_GREEN);
		authorizedColors.add(DARK_PURPLE);
		authorizedColors.add(DARK_RED);
		authorizedColors.add(GREEN);
		authorizedColors.add(LIGHT_PURPLE);
		authorizedColors.add(RED);
		authorizedColors.add(RESET);
		authorizedColors.add(STRIKETHROUGH);
		authorizedColors.add(UNDERLINE);
		authorizedColors.add(WHITE);
		authorizedColors.add(YELLOW);
		authorizedColors.add(AQUA);
		authorizedColors.add(BLACK);
		authorizedColors.add(BOLD);
		authorizedColors.add(DARK_AQUA);
		authorizedColors.add(DARK_GRAY);
		authorizedColors.add(GOLD);
		authorizedColors.add(GRAY);
		authorizedColors.add(ITALIC);
		authorizedColors.add(MAGIC);
	}
}
