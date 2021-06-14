package be.kuleuven.groept.softdev.part7.formlayout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

/**
 * A layout manager that lays out components along a central axis
 */
public class FormLayout implements LayoutManager {
	@Override
	public Dimension preferredLayoutSize(Container parent) {
		Component[] components = parent.getComponents();
		left = 0;
		right = 0;
		height = 0;
		for (int i = 0; i < components.length; i += 2) {
			Component cleft = components[i];
			Component cright = components[i + 1];

			Dimension dleft = cleft.getPreferredSize();
			Dimension dright = cright.getPreferredSize();
			left = Math.max(left, dleft.width);
			right = Math.max(right, dright.width);
			height = height + Math.max(dleft.height, dright.height);
		}
		return new Dimension(left + GAP + right, height);
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		return preferredLayoutSize(parent);
	}

	@Override
	public void layoutContainer(Container parent) {
		System.out.println("layoutcontainer called!");
		preferredLayoutSize(parent); // Sets left, right

		Component[] components = parent.getComponents();

		Insets insets = parent.getInsets();
		int xcenter = insets.left + left;
		int y = insets.top;

		for (int i = 0; i < components.length; i += 2) {
			Component cleft = components[i];
			Component cright = components[i + 1];

			Dimension dleft = cleft.getPreferredSize();
			Dimension dright = cright.getPreferredSize();

			int height = Math.max(dleft.height, dright.height);

			cleft.setBounds(xcenter - dleft.width, y + (height - dleft.height)
					/ 2, dleft.width, dleft.height);

			cright.setBounds(xcenter + GAP, y + (height - dright.height) / 2,
					dright.width, dright.height);
			y += height;
		}
	}

	public void addLayoutComponent(String name, Component comp) {
	}

	public void removeLayoutComponent(Component comp) {
	}

	private int left;
	private int right;
	private int height;
	private static final int GAP = 6;
}