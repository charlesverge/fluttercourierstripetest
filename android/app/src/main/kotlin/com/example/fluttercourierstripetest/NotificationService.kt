package com.example.fluttercourierstripetest

import android.annotation.SuppressLint
import com.courier.android.notifications.presentNotification
import com.courier.android.service.CourierService
import com.google.firebase.messaging.RemoteMessage
import com.example.fluttercourierstripetest.MainActivity

// This is safe. `CourierService` will automatically handle token refreshes.
@SuppressLint("MissingFirebaseInstanceTokenRefresh")
class NotificationService: CourierService() {

    override fun showNotification(message: RemoteMessage) {
        super.showNotification(message)

        // More information on how to customize an Android notification here:
        // https://developer.android.com/develop/ui/views/notifications/build-notification
        // Notifications come in message.data with the keys title, body, trackingUrl
        // Rendering images, markdown or actions would need to be added here
        message.presentNotification(
            context = this,
            handlingClass = MainActivity::class.java,
            icon = android.R.drawable.ic_dialog_info
        )

    }

}
