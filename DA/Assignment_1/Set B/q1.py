import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score
import matplotlib.pyplot as plt
fish_data = pd.read_csv('Fish.csv')
print(fish_data.head())
X = fish_data[['Length1', 'Length2', 'Length3', 'Height', 'Width']]
y = fish_data['Weight']
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
model = LinearRegression()
model.fit(X_train, y_train)
y_pred = model.predict(X_test)
mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)
print("Model Evaluation:")
print("Mean Squared Error (MSE):", mse)
print("R-squared (R2):", r2)
plt.scatter(X_test['Length1'], y_test, color='black', label='Actual')
plt.scatter(X_test['Length1'], y_pred, color='blue', label='Predicted')
plt.xlabel('Length1')
plt.ylabel('Weight')
plt.legend()
plt.show()
