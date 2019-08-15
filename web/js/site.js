function ProceedResult(result, nullDataMessage = "") {
    if (!result) {
        if (nullDataMessage !== "") {
            NotificationError(nullDataMessage);
        } else {
            NotificationError("Can't reach server.");
        }

        return false;
    } else {
        if (result.success) {
            return true;
        } else {
            if (result.errors) {
                result.errors.forEach(function (error) {
                    NotificationError(error);
                });
            }
            return false;
        }
    }
}

$.notifyDefaults({
    placement: {
        from: "bottom"
    },
    animate: {
        enter: "animated fadeInUp",
        exit: "animated fadeOutDown"
    }
});

function NotificationError(message) {
    $.notify({
        icon: 'fa fa-exclamation-triangle',
        title: "&nbsp;&nbsp;",
        message: message
    },
        {
            type: 'danger'
        });
}

function NotificationWarning(message) {
    $.notify({
        message: message
    },
        {
            type: 'warning'
        });
}

function NotificationInfo(message) {
    $.notify({
        message: message
    });
}

function NotificationSuccess(message) {
    $.notify({
        icon: 'fa fa-check',
        title: "&nbsp;&nbsp;",
        message: message
    },
        {
            type: 'success'
        });
}