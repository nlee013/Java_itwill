package com.score6;

import java.io.Serializable;

public class DataVO implements Serializable{
		
		private String name, birth;
		private int score;
		
		public DataVO() {
			
			this.name = name;
			this.birth = birth;
			this.score = score;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBirth() {
			return birth;
		}

		public void setBirth(String birth) {
			this.birth = birth;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}
		
		@Override
		public String toString() {
			
			return name + ":" + birth + score;
		}
}
