public class MergerIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergerIntervals m = new MergerIntervals();
		m.sortIntervals("5-8, 1-2, 1-4, 12-15, 9-10, 6-7, 15-18, 19-20");

	}

	public void sortIntervals(String input) {

		input = input.replaceAll("\\s+", "");
		String[] inputArray = input.split(",");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < inputArray.length; i++) {
			int index = i;
			for (int j = i + 1; j < inputArray.length; j++) {
				inputArray[j] = inputArray[j].replaceAll("\\s+", "");
				int first = Integer.parseInt(inputArray[j].substring(0,
						inputArray[j].indexOf("-")));
				int second = Integer.parseInt(inputArray[index].substring(0,
						inputArray[index].indexOf("-")));
				if (first < second)
					index = j;
			}
			String smallerNumber = inputArray[index];
			inputArray[index] = inputArray[i];
			inputArray[i] = smallerNumber;
		}

		for (int i = 0; i < inputArray.length - 1; i++) {
			int firstmin = Integer.parseInt(inputArray[i].substring(0,
					inputArray[i].indexOf("-")));
			int firstmax = Integer.parseInt(inputArray[i]
					.substring(inputArray[i].indexOf("-") + 1));
			int secondmin = Integer.parseInt(inputArray[i + 1].substring(0,
					inputArray[i + 1].indexOf("-")));
			int secondmax = Integer.parseInt(inputArray[i + 1]
					.substring(inputArray[i + 1].indexOf("-") + 1));

			if (firstmax >= secondmin) {
				if (firstmax <= secondmax) {
					sb.append(firstmin + "-" + Math.max(firstmax, secondmax));
					inputArray[i + 1] = firstmin + "-"
							+ Math.max(firstmax, secondmax);
					if (i != inputArray.length) {
						sb.append(", ");
					}

				}
				inputArray[i + 1] = firstmin + "-"
						+ Math.max(firstmax, secondmax);
			} else {
				sb.append(inputArray[i + 1]);
				sb.append(", ");
			}
		}

		System.out.println(sb.toString());

	}
}
