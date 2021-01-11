package com.project2.controller;
import java.util.Comparator;

import com.project2.model.Feedback;

public class FeedbackComparator implements Comparator<Feedback> {

	@Override
	public int compare(Feedback o1, Feedback o2) {
		return o2.getId() - o1.getId();
	}

}
