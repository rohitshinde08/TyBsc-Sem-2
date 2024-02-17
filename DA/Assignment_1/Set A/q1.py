import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn import metrics
import numpy as np

np.random.seed(42)

data = {
    'ID': range(1, 501),
    'TV': np.random.uniform(0, 100, 500),
    'Radio': np.random.uniform(0, 50, 500),
    'Newspaper': np.random.uniform(0, 20, 500),
    'Sales': np.random.uniform(0, 200, 500)
}

sales_df = pd.DataFrame(data)

X = sales_df[['TV', 'Radio', 'Newspaper']]
y = sales_df['Sales']

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)

print("Training set shape:")
print("X_train:", X_train.shape)
print("y_train:", y_train.shape)

print("\nTesting set shape:")
print("X_test:", X_test.shape)
print("y_test:", y_test.shape)

model = LinearRegression()

model.fit(X_train, y_train)

y_pred = model.predict(X_test)

# Evaluate the model
mse = metrics.mean_squared_error(y_test, y_pred)
rmse = np.sqrt(mse)

print("\nModel Evaluation:")
print("Mean Squared Error (MSE):", mse)
print("Root Mean Squared Error (RMSE):", rmse)
