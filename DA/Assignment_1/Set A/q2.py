import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn import metrics
import numpy as np

# Set a seed for reproducibility
np.random.seed(42)

# Create the 'realestate' dataset with 500 entries
data = {
    'ID': range(1, 501),
    'flat': np.random.uniform(50000, 200000, 500),
    'houses': np.random.uniform(100000, 500000, 500),
    'purchases': np.random.uniform(50000, 300000, 500)
}

realestate_df = pd.DataFrame(data)

# Identify independent (features) and target variable
X = realestate_df[['flat', 'houses']]
y = realestate_df['purchases']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Print the shapes of training and testing sets
print("Training set shape:")
print("X_train:", X_train.shape)
print("y_train:", y_train.shape)

print("\nTesting set shape:")
print("X_test:", X_test.shape)
print("y_test:", y_test.shape)

# Build a simple linear regression model
model = LinearRegression()

# Fit the model on the training data
model.fit(X_train, y_train)

# Make predictions on the testing data
y_pred = model.predict(X_test)

# Evaluate the model
mse = metrics.mean_squared_error(y_test, y_pred)
rmse = np.sqrt(mse)

print("\nModel Evaluation:")
print("Mean Squared Error (MSE):", mse)
print("Root Mean Squared Error (RMSE):", rmse)
