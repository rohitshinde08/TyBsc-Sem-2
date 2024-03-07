import pandas as pd
import nltk
from nltk.tokenize import word_tokenize
from nltk.sentiment.vader import SentimentIntensityAnalyzer

data = pd.read_csv("covid_2021_1.csv")

data.dropna(subset=['title'], inplace=True)

data['tokenized_comments'] = data['title'].apply(lambda x: word_tokenize(str(x)))

sid = SentimentIntensityAnalyzer()
data['sentiment'] = data['title'].apply(lambda x: sid.polarity_scores(str(x)))

def get_sentiment_category(sentiment):
    if sentiment['compound'] >= 0.05:
        return 'Positive'
    elif sentiment['compound'] <= -0.05:
        return 'Negative'
    else:
        return 'Neutral'

data['sentiment_category'] = data['sentiment'].apply(get_sentiment_category)

sentiment_counts = data['sentiment_category'].value_counts(normalize=True) * 100

print("Percentage of comments by sentiment category:")
print(sentiment_counts)

print("\nCleaned dataset:")
print(data.head())
